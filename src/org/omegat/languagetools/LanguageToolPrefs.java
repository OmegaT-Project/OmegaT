/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2016 Lev Abashkin
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

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

package org.omegat.languagetools;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.omegat.languagetools.LanguageToolWrapper.BridgeType;
import org.omegat.util.Preferences;

/**
 * Manage LanguageTool preferences from one place
 *
 * @author Lev Abashkin
 */
public class LanguageToolPrefs {

    private LanguageToolPrefs() {

    }

    public static void disableRule(String ruleId, String languageCode) {
        Set<String> rules = getEnabledRules(languageCode);
        rules.remove(ruleId);
        setEnabledRules(rules, languageCode);
        rules = getDisabledRules(languageCode);
        rules.add(ruleId);
        setDisabledRules(rules, languageCode);
    }

    public static void setBridgeType(BridgeType bridgeType) {
        Preferences.setPreference(Preferences.LANGUAGETOOL_BRIDGE_TYPE, bridgeType);
    }

    public static BridgeType getBridgeType() {
        return Preferences.getPreferenceEnumDefault(Preferences.LANGUAGETOOL_BRIDGE_TYPE,
                BridgeType.NATIVE);
    }

    public static void setRemoteUrl(String url) {
        Preferences.setPreference(Preferences.LANGUAGETOOL_REMOTE_URL, url);
    }

    public static String getRemoteUrl() {
        return Preferences.getPreference(Preferences.LANGUAGETOOL_REMOTE_URL);
    }

    public static void setLocalServerJarPath(String path) {
        Preferences.setPreference(Preferences.LANGUAGETOOL_LOCAL_SERVER_JAR_PATH, path);
    }

    public static String getLocalServerJarPath() {
        return Preferences.getPreference(Preferences.LANGUAGETOOL_LOCAL_SERVER_JAR_PATH);
    }

    public static void setDisabledRules(Set<String> rules, String languageCode) {
        setLanguageSpecificPrefernce(rules,
                Preferences.LANGUAGETOOL_DISABLED_RULES_PREFIX, languageCode);
    }

    public static void setEnabledRules(Set<String> rules, String languageCode) {
        setLanguageSpecificPrefernce(rules,
                Preferences.LANGUAGETOOL_ENABLED_RULES_PREFIX, languageCode);
    }

    public static void setDisabledCategories(Set<String> categories, String languageCode) {
        setLanguageSpecificPrefernce(categories,
                Preferences.LANGUAGETOOL_DISABLED_CATEGORIES_PREFIX, languageCode);
    }

    public static Set<String> getDisabledRules(String languageCode) {
        return getLangauageSpecificPreference(Preferences.LANGUAGETOOL_DISABLED_RULES_PREFIX,
                languageCode);
    }

    public static Set<String> getEnabledRules(String languageCode) {
        return getLangauageSpecificPreference(Preferences.LANGUAGETOOL_ENABLED_RULES_PREFIX,
                languageCode);
    }

    public static Set<String> getDisabledCategories(String languageCode) {
        return getLangauageSpecificPreference(Preferences.LANGUAGETOOL_DISABLED_CATEGORIES_PREFIX,
                languageCode);
    }

    private static Set<String> getLangauageSpecificPreference(String namePrefix,
            String languageCode) {
        return Stream.of(Preferences
                .getPreference(namePrefix + "_" + languageCode).split(","))
                .filter(s -> !s.isEmpty()).collect(Collectors.toSet());
    }

    private static void setLanguageSpecificPrefernce(Set<String> data,
            String namePrefix, String languageCode) {
        Preferences.setPreference(namePrefix + "_" + languageCode, String.join(",", data));
    }
}
