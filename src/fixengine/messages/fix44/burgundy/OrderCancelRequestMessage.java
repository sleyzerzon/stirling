/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fixengine.messages.fix44.burgundy;

import fixengine.messages.AbstractOrderCancelRequestMessage;
import fixengine.messages.MessageHeader;
import fixengine.messages.Required;
import fixengine.tags.ClOrdID;
import fixengine.tags.OrderID;
import fixengine.tags.OrderQty;
import fixengine.tags.OrigClOrdID;
import fixengine.tags.SecurityID;
import fixengine.tags.Side;
import fixengine.tags.Symbol;
import fixengine.tags.TransactTime;
import fixengine.tags.fix44.burgundy.SecurityIDSource;

public class OrderCancelRequestMessage extends AbstractOrderCancelRequestMessage {
    public OrderCancelRequestMessage(MessageHeader header) {
        super(header);
    }

    @Override protected void fields() {
        field(ClOrdID.TAG);
        field(OrderID.TAG, Required.NO);
        field(OrderQty.TAG);
        field(OrigClOrdID.TAG);
        field(Side.TAG);
        field(Symbol.TAG);
        field(SecurityIDSource.TAG, Required.NO);
        field(SecurityID.TAG, Required.NO);
        field(TransactTime.TAG);
    }
}