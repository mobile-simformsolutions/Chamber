/*
 * Copyright (C) 2019 skydoves
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

package com.skydoves.chamberdemo

import androidx.lifecycle.ViewModel
import com.skydoves.chamber.ChamberProperty
import com.skydoves.chamber.annotation.PropertyObserver
import com.skydoves.chamber.annotation.ShareProperty
import com.skydoves.chamberdemo.scope.UserScope

@UserScope // custom scope
class MainActivityViewModel : ViewModel() {

  @ShareProperty(key = UserScope.nickname)
  var username = ChamberProperty("skydoves")

  @PropertyObserver(key = UserScope.nickname)
  fun usernameObserver(value: String) {
    LogUtils.log("usernameObserver: $value")
  }
}