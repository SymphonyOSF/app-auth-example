/*
 * Copyright 2016-2017 Symphony Application Authentication - Symphony LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.symphony.example.users;

/**
 * Exception thrown when user who is expected to be present is not found in the store.
 *
 * @author Dan Nathanson
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException(String username) {
        super("Could not find user with username '" + username + "'");
    }


}
