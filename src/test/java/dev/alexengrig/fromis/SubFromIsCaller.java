/*
 * Copyright 2019 - 2020 Alexengrig Dev.
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

package dev.alexengrig.fromis;

import java.util.List;

public class SubFromIsCaller {

    public static class Sub {

        public static StackTraceElement here() {
            return here0();
        }

        private static StackTraceElement here0() {
            return FromIs.here();
        }

        public static StackTraceElement upOne() {
            return upOne0();
        }

        private static StackTraceElement upOne0() {
            return upOne1();
        }

        private static StackTraceElement upOne1() {
            return FromIs.up(1);
        }

        public static List<StackTraceElement> hereAll() {
            return hereAll0();
        }

        private static List<StackTraceElement> hereAll0() {
            return FromIs.hereAll();
        }

        public static List<StackTraceElement> upAllOne() {
            return upAllOne0();
        }

        private static List<StackTraceElement> upAllOne0() {
            return upAllOne1();
        }

        private static List<StackTraceElement> upAllOne1() {
            return FromIs.upAll(1);
        }
    }
}
