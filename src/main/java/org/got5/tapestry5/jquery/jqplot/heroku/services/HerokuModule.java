//
// Copyright 2010 GOT5 (GO Tapestry 5)
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.got5.tapestry5.jquery.jqplot.heroku.services;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.Configuration;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.OrderedConfiguration;
import org.apache.tapestry5.services.ComponentClassTransformWorker;
import org.apache.tapestry5.services.LibraryMapping;
import org.apache.tapestry5.services.javascript.JavaScriptStack;
import org.got5.tapestry5.jquery.jqplot.heroku.*;




public class HerokuModule
{
       
    public static void contributeApplicationDefaults(MappedConfiguration<String, String> configuration)
    {
        configuration.add(SymbolConstants.PRODUCTION_MODE, "false");
        configuration.add(SymbolConstants.COMBINE_SCRIPTS, "false");
        configuration.add(SymbolConstants.GZIP_COMPRESSION_ENABLED, "false");
        configuration.add(SymbolConstants.SUPPORTED_LOCALES, "en,fr,de");

    }
   
    

}
