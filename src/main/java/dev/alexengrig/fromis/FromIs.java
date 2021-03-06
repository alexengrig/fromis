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

import java.util.Arrays;
import java.util.List;

public class FromIs {

    public static StackTraceElement here() {
        Throwable throwable = new Throwable();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        return getElement(stackTrace, 2);
    }

    public static List<StackTraceElement> hereAll() {
        Throwable throwable = new Throwable();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        return Arrays.asList(getElements(stackTrace, 2));
    }

    public static StackTraceElement up(int height) {
        if (height < 0) throw new IllegalArgumentException("The height must not be less than zero");
        Throwable throwable = new Throwable();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        return getElement(stackTrace, 2 + height);
    }

    public static List<StackTraceElement> upAll(int height) {
        if (height < 0) throw new IllegalArgumentException("The height must not be less than zero");
        Throwable throwable = new Throwable();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        return Arrays.asList(getElements(stackTrace, 2 + height));
    }

    private static StackTraceElement getElement(StackTraceElement[] stackTrace, int index) {
        return stackTrace[index >= stackTrace.length ? stackTrace.length - 1 : index];
    }

    private static StackTraceElement[] getElements(StackTraceElement[] stackTrace, int begin) {
        StackTraceElement[] target = new StackTraceElement[stackTrace.length - begin];
        System.arraycopy(stackTrace, begin, target, 0, target.length);
        return target;
    }
}
