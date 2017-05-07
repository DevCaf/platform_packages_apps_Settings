/*
 * Copyright (C) 2017 The Nebula Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.-
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

package com.android.settings.nebula;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.preference.Preference;

import com.android.internal.logging.MetricsProto.MetricsEvent;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class About extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.nebula_about);
    }

    @Override
    public boolean onPreferenceTreeClick(Preference preference) {
        if (preference.getKey().equals("updates")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.update_dialog);
            builder.setItems(R.array.update_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] notificationValues = {"https://forum.xda-developers.com/htc-10/development/rom-aosnp-android-source-nebula-project-t3599095"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = notificationValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("social")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.social_dialog);
            builder.setItems(R.array.social_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] socialValues = {"https://plus.google.com/communities/112250185941758695492",
                        "about:blank"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = socialValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("Eliminater74")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.elim_dialog);
            builder.setItems(R.array.elim_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] elimValues = {"https://forum.xda-developers.com/member.php?u=5687366"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = elimValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("ssojyeti2")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.ssojyeti2_dialog);
            builder.setItems(R.array.ssojyeti2_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] ssojyeti2Values = {
                        "https://forum.xda-developers.com/member.php?u=3570510"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = ssojyeti2Values[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
		} else if (preference.getKey().equals("prsterero")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.prsterero_dialog);
            builder.setItems(R.array.prsterero_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] prstereroValues = {
                        "https://forum.xda-developers.com/member.php?u=4255135"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = prstereroValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        }
        return super.onPreferenceTreeClick(preference);
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.NEBULA;
    }
}
