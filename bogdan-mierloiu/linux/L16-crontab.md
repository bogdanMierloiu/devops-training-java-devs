`cron` is a service responsible for control and execution of scheduled tasks
`crontab` is simply a list of tasks or commands which are scheduled to be executed on specific date and time

`cat /etc/crontab` -> show the system crontab file with instructions on how to use it

`crontab -l` -> list the current user's crontab
`crontab -e` -> edit the current user's crontab

`* * * * * /usr/bin/ls -al >> logfile 2>&1` -> append every minute in logfile

`cat /var/log/syslog` -> show system logs including cron jobs