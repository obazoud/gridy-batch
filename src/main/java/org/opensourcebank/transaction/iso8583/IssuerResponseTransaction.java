/*
 * Copyright 2011 Anatoly Polinsky
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.opensourcebank.transaction.iso8583;

/**
 * <p>Issuer response to a point-of-sale terminal for authorization for a cardholder purchase.</p>
 *
 * @author anatoly.polinsky
 */
public class IssuerResponseTransaction  extends AbstractIso8583Transaction {

    private static final long serialVersionUID = -595562864790822371L;

    // some relevant properties.. and accessors

    @Override
    public String toString() {
        return "| ID: " + getId() + " \t| " +
                this.getClass().getSimpleName() + "\t\t| external ID: " + getExternalId() + " | " +
                getStatus() + "\t| ";
    }

}