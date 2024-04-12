`ps` -> process status command
`ps aux` / `ps -ef` -> show all processes
`pstree` -> show the process tree


`PID` - the process id.
`TTY` - Terminal associated with the process.
`TIME` - total time of CPU usage
`CMD` - the command which is running
`STAT` - process state:

Statuses:

`D` - uninterruptible sleep (usually IO)
`I` - Idle kernel thread
`R` - running or runnable (on run queue)
`S` - uninterruptible sleep (waiting for an event to complete)
`T` - stopped by job control signal
`t` - stopped by debugger during the tracing
`X` - dead (should never be seen)
`Z` - defunct ("zombie") process, terminated but not reaped by its parent

second letter:
`<` - high-priority (not nice to other users)
`N` - low-priority (nice to other users)
`s` - is a session leader
`l` - is multi-threaded
`+ -` is in the foreground process group