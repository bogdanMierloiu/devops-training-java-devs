# I/O streams - Input/Output streams

`STDIN` - standard input stream - file descriptor 0
`STDOUT` - standard output stream - file descriptor 1
`STDERR` - standard error stream - file descriptor 2

`cat file-not-exists.txt 2> error.log` -> redirect error to file
`cat notexists.txt 2> /dev/null`   -> redirect error to nowhere
`/dev/null` - special file to which we can write, but not read


`>` - redirect output
`>>` - append output
`<` - redirect input
`|` - pipe output



`cat .profile 1> catfile 2> errorfile` -> redirect output and error
`cat catfile` - we have results here


`ls -al /dev/fd` -> list file descriptors
`tty` -> show the terminal device