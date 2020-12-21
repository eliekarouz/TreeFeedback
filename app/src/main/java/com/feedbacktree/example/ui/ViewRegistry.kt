/*
 * Created by eliek on 9/26/2019
 * Copyright (c) 2019 eliekarouz. All rights reserved.
 */

package com.feedbacktree.example.ui

import com.feedbacktree.example.flows.counter.CounterLayoutBinder
import com.feedbacktree.example.flows.fingerprint.EnterFingerprintLayoutRunner
import com.feedbacktree.example.flows.login.LoginLayoutRunner
import com.feedbacktree.example.flows.root.RootLayoutBinder
import com.feedbacktree.flow.ui.views.core.ViewRegistry

val appViewRegistry = ViewRegistry(
    RootLayoutBinder,
    CounterLayoutBinder,
    LoginLayoutRunner,
    EnterFingerprintLayoutRunner
)