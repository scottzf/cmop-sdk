@echo off
echo [Pre-Requirement] Makesure install JDK 6.0+ and set the JAVA_HOME.
echo [Pre-Requirement] Makesure install Maven 3.0.3+ and set the PATH.

set MVN=mvn
set MAVEN_OPTS=%MAVEN_OPTS% 

call %MVN% clean assembly:assembly  -Dmaven.test.skip=true

goto end
:error
echo Error Happen!!
:end
pause