/*
 * Copyright 2011-2011 Gregory Shrago
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
package org.intellij.grammar.psi.impl;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.util.PsiTreeUtil;
import org.intellij.grammar.BnfLanguage;

/**
 * @author gregsh
 */
public class BnfElementFactory {
  public static PsiElement createLeafFromText(Project project, String text) {
    PsiFile fileFromText = PsiFileFactory.getInstance(project).createFileFromText("a.bnf", BnfLanguage.INSTANCE, text);
    return PsiTreeUtil.getDeepestFirst(fileFromText);
  }
}