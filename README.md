# wildflyApp

launch wildfly server in debug mode 

sh standalone.sh --debug (default debug mode is 8787)

in idea simple remote connection with transport socket port 8787

with params in cmd: -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8787

debugger mode Attach to remote JVM
