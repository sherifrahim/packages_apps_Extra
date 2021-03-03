/*
 * Copyright (C) 2020 The Dirty Unicorns Project
 *
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

package com.nezuko.extra.fragments.team;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.settings.R;

import java.util.ArrayList;
import java.util.List;

public class TeamActivity extends Activity {

    private List<DevInfoAdapter> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_recyclerview);

        initTeam();

        Window window = getWindow();
        window.setGravity(Gravity.BOTTOM);
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT);
    }
    private void initTeam(){
        RecyclerView mRecycleview = findViewById(R.id.listView);
       setTeamMember("Maitreya Patni", getString(R.string.lead_title), "Maitreya29", "Maitreya29",
                R.drawable.maitreya);
        setTeamMember("mrStark", getString(R.string.developer_title)
                + " / " + getString(R.string.contributor_title), "tanishqmanuja", "mrStark0018",
                R.drawable.stark);
        setTeamMember("AtomicXZ", getString(R.string.contributor_main_title), "AtomicXZ", "AtomicXZ",
                R.drawable.atomic);
       setTeamMember("MR.ROBOT.MK", getString(R.string.maintainer_title), "CoolGuyMK", "SILENT_KILLER404",
                R.drawable.mrrobot);
       setTeamMember("Wahid Nursidik", getString(R.string.maintainer_title), "dns24", "attack_dns24",
                R.drawable.wahid);
       setTeamMember("Zaid Khan", getString(R.string.maintainer_title), "zaidkhan0997", "zaidkhan0997",
                R.drawable.zaid);
       setTeamMember("Muhammad Fauzan", getString(R.string.maintainer_title), "xzanxz", "buglessx",
                R.drawable.xzanxz);
        ListAdapter mAdapter = new ListAdapter(mList);
        mRecycleview.setAdapter(mAdapter);
        mRecycleview.setLayoutManager(new LinearLayoutManager(this));
        mAdapter.notifyDataSetChanged();
    }

    private void setTeamMember(String devName, String devTitle,
                               String githubLink, String telegram, int devImage) {
        DevInfoAdapter adapter;

        adapter = new DevInfoAdapter();
        adapter.setImage(devImage);
        adapter.setDevName(devName);
        adapter.setDevTitle(devTitle);
        adapter.setGithubName(githubLink);
        adapter.setTelegramName(telegram);
        mList.add(adapter);
    }
}
