/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2020 Briac Pilpre
               2021 Hiroshi Miura
               Home page: http://www.omegat.org/
               Support center: https://omegat.org/support

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.core.data;

import java.net.URL;
import java.util.Arrays;
import java.util.Properties;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.omegat.filters2.master.PluginUtils;

public class PluginInformation implements Comparable<PluginInformation> {
    private static final String PLUGIN_NAME = "Plugin-Name";
    private static final String PLUGIN_VERSION = "Plugin-Version";
    private static final String PLUGIN_AUTHOR = "Plugin-Author";
    private static final String PLUGIN_DESCRIPTION = "Plugin-Description";
    private static final String PLUGIN_CATEGORY = "Plugin-Category";
    private static final String PLUGIN_LINK = "Plugin-Link";
    private static final String PLUGIN_TYPE = "OmegaT-Plugin";

    private static final String IMPLEMENTATION_VENDOR = "Implementation-Vendor";
    private static final String IMPLEMENTATION_TITLE = "Implementation-Title";
    private static final String IMPLEMENTATION_VERSION = "Implementation-Version";
    private static final String BUNDLE_VERSION = "Bundle-Version";
    private static final String BUNDLE_NAME = "Bundle-Name";
    private static final String BUILT_BY = "Built-By";

    public enum Status {
        INSTALLED,
        BUNDLED,
        UPGRADABLE,
    }

    private final String className;
    private final String name;
    private final String version;
    private final String author;
    private final String description;
    private final String category;
    private final String link;
    private final URL url;
    private Status status;

    public PluginInformation(final String className, final Manifest manifest, final URL mu, final Status status) {
        this.className = className;
        Attributes mainAttrs = manifest.getMainAttributes();
        Attributes attrs = manifest.getEntries().get(className);
        if (attrs == null) {
              attrs = manifest.getMainAttributes();
        }
        name = findName(attrs);
        version = findVersion(attrs, mainAttrs);
        author = findAuthor(mainAttrs);
        description = attrs.getValue(PLUGIN_DESCRIPTION);
        link = attrs.getValue(PLUGIN_LINK);
        url = mu;
        category = categoryName(attrs.getValue(PLUGIN_CATEGORY), attrs.getValue(PLUGIN_TYPE));
        this.status = status;
    }

    public PluginInformation(String className, Properties props, final String key, final URL mu, final Status status) {
        this.className = className;
        name = className.substring(className.lastIndexOf(".") + 1);
        version = null;
        author = null;
        description = null;
        category = categoryName(key, null);
        link = null;
        url = mu;
        this.status = status;
    }

    private String categoryName(final String key1, final String key2) {
        String key = key1 != null ? key1 : key2;
        return Arrays.stream(PluginUtils.PluginType.values()).filter(v ->
                v.getTypeValue().equals(key)).findFirst().orElse(PluginUtils.PluginType.UNKNOWN).getTypeValue();
    }

    private String findName(Attributes attrs) {

        if (attrs.getValue(PLUGIN_NAME) != null) {
            return attrs.getValue(PLUGIN_NAME);
        } else if (attrs.getValue(BUNDLE_NAME) != null) {
            return attrs.getValue(BUNDLE_NAME);
        } else if (attrs.getValue(IMPLEMENTATION_TITLE) != null) {
            return attrs.getValue(IMPLEMENTATION_TITLE);
        }
        // fallback to className
        return className.substring(className.lastIndexOf(".") + 1);
    }

    private String findVersion(Attributes attrs, Attributes mainAttrs) {
        if (attrs.getValue(PLUGIN_VERSION) != null) {
            return attrs.getValue(PLUGIN_VERSION);
        } else if (attrs.getValue(BUNDLE_VERSION) != null) {
            return attrs.getValue(BUNDLE_VERSION);
        } else if (attrs.getValue(IMPLEMENTATION_VERSION) != null) {
            return attrs.getValue(IMPLEMENTATION_VERSION);
        } else if (mainAttrs.getValue(PLUGIN_VERSION) != null) {
            return mainAttrs.getValue(PLUGIN_VERSION);
        } else if (mainAttrs.getValue(BUNDLE_VERSION) != null) {
            return mainAttrs.getValue(BUNDLE_VERSION);
        } else if (mainAttrs.getValue(IMPLEMENTATION_VERSION) != null) {
            return mainAttrs.getValue(IMPLEMENTATION_VERSION);
        }
        return "unknown";
    }

    private String findAuthor(Attributes attrs) {
        if ("org.omegat.Main".equals(attrs.getValue("Main-Class"))) {
            return "OmegaT team";
        } else if (attrs.getValue(PLUGIN_AUTHOR) != null) {
            return attrs.getValue(PLUGIN_AUTHOR);
        } else if (attrs.getValue(IMPLEMENTATION_VENDOR) != null) {
            return attrs.getValue(IMPLEMENTATION_VENDOR);
        } else if (attrs.getValue(BUILT_BY) != null) {
            return attrs.getValue(BUILT_BY);
        }
        return null;
    }

    public String getClassName() {
        return className;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public final String getCategory() {
        return category;
    }

    public final String getLink() {
        return link;
    }

    public URL getUrl() {
        return url;
    }

    public final boolean isBundled() {
        return status == Status.BUNDLED;
    }

    public final boolean isInstalled() {
        return status == Status.INSTALLED || status == Status.BUNDLED || status == Status.UPGRADABLE;
    }

    public final Status getStatus() {
        return status;
    }

    public final void setStatus(Status s) {
        status = s;
    }

    @Override
    public String toString() {
        return "PluginInformation [className=" + className + ", name=" + name +
                ", version=" + version + ", author=" + author + ", description=" +
                description + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((className == null) ? 0 : className.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PluginInformation other = (PluginInformation) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (className == null) {
            if (other.className != null)
                return false;
        } else if (!className.equals(other.className))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (version == null) {
            return other.version == null;
        } else return version.equals(other.version);
    }

    @Override
    public final int compareTo(PluginInformation pluginInformation) {
        int score;
        if (this == pluginInformation || className.equals(pluginInformation.getClass().getName())) {
            return version.compareTo(pluginInformation.getVersion());
        }
        if (pluginInformation.category != null) {
            if (category == null) {
                if ("bundle".equals(pluginInformation.category)) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                score = category.compareTo(pluginInformation.getCategory());
                if (score != 0) {
                    return score;
                }
            }
        }
        if (pluginInformation.getAuthor() != null) {
            if (author == null) {
                return -1;
            } else {
                score = author.compareTo(pluginInformation.getAuthor());
                if (score != 0) {
                    return score;
                }
            }
        }
        score = className.compareTo(pluginInformation.getClassName());
        if (score != 0) {
            return score;
        }
        if (pluginInformation.getName() != null) {
            if (name == null) {
                return -1;
            }
            score = name.compareTo(pluginInformation.getName());
            if (score != 0) {
                return score;
            }
        }
        if (pluginInformation.getVersion() != null) {
            if (version == null) {
                return -1;
            }
            return version.compareTo(pluginInformation.getVersion());
        }
        return 0;
    }
}
