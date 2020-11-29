/*
 * Copyright (C) 2021 NezukoOS
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nezuko.extra.fragments;

import android.content.res.Resources;
import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;

import android.os.SystemProperties;
import android.content.ContentResolver;
import androidx.preference.*;

import com.android.internal.logging.nano.MetricsProto.MetricsEvent;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class FOD extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.fod);

        getActivity().getActionBar().setTitle(R.string.fod_category_title);
    }

    @Override
    public int getMetricsCategory() {
        return MetricsEvent.NEZUKO;
    }
}
