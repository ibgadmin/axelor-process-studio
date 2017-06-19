/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2017 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.qas.web_2005_02;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-09-12T15:14:19.665+02:00
 * Generated source version: 2.6.2
 */

@WebFault(name = "QAFault", targetNamespace = "http://www.qas.com/web-2005-02")
public class Fault extends Exception {
    
    private com.qas.web_2005_02.QAFault qaFault;

    public Fault() {
        super();
    }
    
    public Fault(String message) {
        super(message);
    }
    
    public Fault(String message, Throwable cause) {
        super(message, cause);
    }

    public Fault(String message, com.qas.web_2005_02.QAFault qaFault) {
        super(message);
        this.qaFault = qaFault;
    }

    public Fault(String message, com.qas.web_2005_02.QAFault qaFault, Throwable cause) {
        super(message, cause);
        this.qaFault = qaFault;
    }

    public com.qas.web_2005_02.QAFault getFaultInfo() {
        return this.qaFault;
    }
}
