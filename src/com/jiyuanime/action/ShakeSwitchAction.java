package com.jiyuanime.action;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Presentation;
import com.jiyuanime.config.Config;

/**
 * 震动开关
 * <p>
 * Created by suika on 15-12-22.
 */
public class ShakeSwitchAction extends BaseSwitchAction {

    @Override
    boolean getSwitchFieldValue() {
        return state.IS_SHAKE;
    }

    @Override
    void setSwitchFieldValue(boolean is_enable) {
        state.IS_SHAKE = is_enable;
    }
}
