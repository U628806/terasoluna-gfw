/*
 * Copyright (C) 2013-2014 terasoluna.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.terasoluna.gfw.common.date;

import org.terasoluna.gfw.common.date.jodatime.JdbcAdjustedJodaTimeDateFactory;

/**
 * <strong>This class exists for backward compatibility with 1.0.x. Please use
 * {@link org.terasoluna.gfw.common.date.jodatime.JdbcAdjustedJodaTimeDateFactory} instead of this class.</strong>
 * <br>
 * Concrete Implementation class of {@link DateFactory}.
 * <P>
 * Adds an adjustment value to current system date. <br>
 * Database is used to store the adjustment value to current system date. <br>
 * Depending on the settings, the adjustment value can also be cached. <br>
 * </P>
 */
@Deprecated
public class JdbcAdjustedDateFactory extends JdbcAdjustedJodaTimeDateFactory implements DateFactory {
}
