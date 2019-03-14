/*
 * Copyright (c) 2019 The sky Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sky.xposed.rimet.ui.dialog;

import android.os.Bundle;
import android.view.View;

import com.sky.xposed.common.ui.util.ViewUtil;
import com.sky.xposed.common.ui.view.CommonFrameLayout;
import com.sky.xposed.common.ui.view.SwitchItemView;

/**
 * Created by sky on 2019/3/13.
 */
public class LuckyMoneyDialog extends CommonDialog {

    private SwitchItemView sivLuckyEnable;

    @Override
    public void createView(CommonFrameLayout frameView) {

        sivLuckyEnable = ViewUtil.newSwitchItemView(getContext(), "自动接收红包");

        frameView.addContent(sivLuckyEnable);
    }

    @Override
    protected void initView(View view, Bundle args) {
        super.initView(view, args);

        setTitle("红包设置");
    }
}
