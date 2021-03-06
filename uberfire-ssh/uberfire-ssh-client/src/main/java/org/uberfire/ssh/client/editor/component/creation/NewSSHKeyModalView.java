/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
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

package org.uberfire.ssh.client.editor.component.creation;

public interface NewSSHKeyModalView {

    void init(Presenter presenter);

    void show();

    void hide();

    void resetValidation();

    void setNameValidationError(String errorMessage);

    void setKeyValidationError(String errorMessage);

    interface Presenter {

        void notifyCancel();

        void notifyAdd(String name, String key);
    }
}
