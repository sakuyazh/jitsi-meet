/*
 * Copyright @ 2017-present Atlassian Pty Ltd
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

package org.jitsi.meet;

import org.jitsi.meet.sdk.JitsiMeetActivity;

/**
 * The one and only {@link Activity} that the Jitsi Meet app needs. The
 * {@code Activity} is launched in {@code singleTask} mode, so it will be
 * created upon application initialization and there will be a single instance
 * of it. Further attempts at launching the application once it was already
 * launched will result in {@link Activity#onNewIntent(Intent)} being called.
 *
 * This {@code Activity} extends {@link JitsiMeetActivity} without adding
 * anything to it. It exists to merely keep the React Native CLI working, since
 * the latter always tries to launch an {@code Activity} named
 * {@code MainActivity} when doing {@code react-native run-android}.
 */
public class MainActivity extends JitsiMeetActivity {
}
