/*
 * Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.bpel.b4p.coordination.db;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.utils.dbcreator.DatabaseCreator;

import java.io.File;
import javax.sql.DataSource;

/**
 * To handle -Dsetup for B4P component
 */
public class B4PDatabaseCreator extends DatabaseCreator {
    private static final Log log = LogFactory.getLog(B4PDatabaseCreator.class);

    public B4PDatabaseCreator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected String getDbScriptLocation(String databaseType) {
        String scriptName = databaseType + ".sql";
        if (log.isDebugEnabled()) {
            log.debug("Loading database script from :" + scriptName);
        }
        String carbonHome = System.getProperty("carbon.home");
        return carbonHome + File.separator + "dbscripts" + File.separator + "bps" + File.separator
                + "bpel" + File.separator + "create" + File.separator + scriptName;
    }
}
