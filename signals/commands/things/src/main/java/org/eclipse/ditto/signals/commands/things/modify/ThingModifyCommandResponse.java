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
package org.eclipse.ditto.signals.commands.things.modify;

import org.eclipse.ditto.model.base.headers.DittoHeaders;
import org.eclipse.ditto.signals.base.WithOptionalEntity;
import org.eclipse.ditto.signals.commands.things.ThingCommandResponse;

/**
 * Aggregates all ThingCommandResponses which modify the state of a {@link org.eclipse.ditto.model.things.Thing}.
 *
 * @param <T> the type of the implementing class.
 */
public interface ThingModifyCommandResponse<T extends ThingModifyCommandResponse> extends ThingCommandResponse<T>,
        WithOptionalEntity {

    @Override
    T setDittoHeaders(DittoHeaders dittoHeaders);
}
