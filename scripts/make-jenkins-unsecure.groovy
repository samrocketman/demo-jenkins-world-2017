/*
   Copyright (c) 2015-2017 Sam Gleske - https://github.com/samrocketman/jenkins-bootstrap-jervis

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   */
/*
   Disables security for demo purposes.  This is not recommended for a normal Jenkins instance.
 */
import hudson.security.AuthorizationStrategy

if(Jenkins.instance.authorizationStrategy.class.simpleName != 'Unsecured') {
	Jenkins.instance.authorizationStrategy = new AuthorizationStrategy.Unsecured()
    Jenkins.instance.save()
    println 'Disabled Jenkins security for demo purposes.'
}
else {
    println 'Nothing changed.  Jenkins security already configured.'
}
null
