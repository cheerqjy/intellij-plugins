/*
 * Copyright 2000-2006 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.communicator.idea.messagesWindow;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import jetbrains.communicator.idea.IDEtalkMessagesWindow;

/**
 * @author Kir
 */
public class CloseAction extends AnAction {
  public void actionPerformed(AnActionEvent e) {
    Project project = (PlatformDataKeys.PROJECT.getData(e.getDataContext()));
    doHideToolwindow(project);
  }

  public static void doHideToolwindow(Project project) {
    if (project != null) {
      project.getComponent(IDEtalkMessagesWindow.class).removeToolWindow();
    }
  }
}
