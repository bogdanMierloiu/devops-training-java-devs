`history` -> `work-history` (100.0%) / arrow up and down to navigate
`history 5` -> show last 5 commands
`CTRL + R` -> navigate through history

`-i` -> ignore cases in search
`grep -i hist /etc/bash.bashrc` -> search for history in bashrc file
`grep -i hist /etc/bash.bashrc | less` -> search for history in bashrc file and show results in less

`history -c` -> clear history
`history -w` -> write history to file
`history -r` -> read history from file
`history -a` -> append history to file

`HISTFILE="/root/.another_history"` -> change history file
`set | grep HIST` -> show history variables
`HISTSIZE=1000` -> set history size

`echo 'set +o history' >> ~/.bashrc` -> disable history
`echo 'set +o history' >> /etc/profile` -> disable history for all users