#! /bin/bash
# Starts the application by default as server and on port 9200
# defined in the gowind.yml file.

set -e

readonly deploy=build/install/GoWind-dropwizard/bin
readonly gowind_server_stdout=$deploy/gowind-server.out
readonly gowind_server_stderr=$deploy/gowind-error.err

cd "$(dirname "${BASH_SOURCE[0]}")"

exec $deploy server src/dist/conf/gowind.yml \
            1>$gowind_server_stdout 2>$gowind_server_stderr
