/*
 *   Copyright (C) 2017-2018 Ze Hao Xiao
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing commandSettings and
 *   limitations under the License.
 */
package com.github.kvnxiao.kommandant.command.registry

import com.github.kvnxiao.kommandant.command.CommandPackage

/**
 * Interface which defines the write-only methods required by a command registry, for sub-commands only.
 */
interface WriteSubCommandRegistry {
    /**
     * Links the supplied sub-command to the parent command specified by the supplied parent command id.
     * Will return false if the parent is invalid.
     */
    fun addSubCommand(subCommand: CommandPackage<*>, parentId: String): Boolean

    /**
     * Unlinks the supplied sub-command from the parent command specified by the supplied parent command id.
     * Will return false if the parent is invalid.
     */
    fun removeSubCommand(subCommandId: String): Boolean
}
