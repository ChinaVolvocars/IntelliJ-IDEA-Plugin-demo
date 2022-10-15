package com.example.demo;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class HelloWorldAction extends AnAction {
  @Override
  public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
    Notifications.Bus.notify(new Notification("Print", "我的第一个插件",
        "Hello,world, " + System.currentTimeMillis(), NotificationType.INFORMATION), anActionEvent.getProject());
  }
}
