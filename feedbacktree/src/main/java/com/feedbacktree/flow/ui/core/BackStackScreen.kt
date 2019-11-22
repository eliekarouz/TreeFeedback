/*
 * Copyright 2018 Square Inc.
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
package com.feedbacktree.flow.ui.core

/**
 * @param stack: screens that have are / have been displayed, ending in the current screen
 */
data class BackStackScreen<StackedT : Any>(
    val stack: List<StackedT>
) {
    constructor(
        vararg stack: StackedT
    ) : this(stack.toList())

    init {
        require(stack.isNotEmpty()) { "Empty stacks are not allowed." }
    }

    val top: StackedT = stack.last()
    val backStack: List<StackedT> = stack.subList(0, stack.size - 1)
}
