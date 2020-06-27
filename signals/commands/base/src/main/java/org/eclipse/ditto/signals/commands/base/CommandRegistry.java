/*
 * Copyright (c) 2017 Bosch Software Innovations GmbH.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/index.php
 *
 * Contributors:
 *    Bosch Software Innovations GmbH - initial contribution
 */
package org.eclipse.ditto.signals.commands.base;

import org.eclipse.ditto.signals.base.JsonParsableRegistry;

/**
 * Registry aware of a set of {@link Command}s which it can parse from a {@link org.eclipse.ditto.json.JsonObject}.
 *
 * @param <T> the type of the Command to parse.
 */
public interface CommandRegistry<T extends Command> extends JsonParsableRegistry<T> {
}
