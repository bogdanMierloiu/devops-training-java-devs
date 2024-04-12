## `file` and `stat` commands

`/var/log` -> logs stored default

`cat /var/log/nginx/access.log` -> show nginx access logs
`tail -f /var/log/nginx/access.log` -> show nginx access logs in real time
`logger "This is a test message"` -> log a message


`journalctl` -> show system logs
`journalctl -b 0` -> show logs from the current boot
`journalctl -u nginx.service` --since today - lists nginx related entries from today
`journalctl _PID=8088` - lists entries for PID (Process IDentifier) 8088. Let's try for one of the Nginx processes:

syslog message levels:
0: emerg
1: alert
2: crit
3: err
4: warning
5: notice
6: info
7: debug

`/var/log/secure` -> authentication logs
`/var/log/messages` -> general system logs
`/var/log/maillog` -> mail server logs
`/var/log/cron` -> cron job logs
`/var/log/boot.log` -> boot logs
`/var/log/dmesg` -> kernel logs
`/var/log/audit/audit.log` -> audit logs
`/var/log/httpd/` -> apache logs
`/var/log/mariadb/` -> mariadb logs
`/var/log/mysql/` -> mysql logs
`/var/log/nginx/` -> nginx logs
`/var/log/samba/` -> samba logs
`/var/log/sssd/` -> sssd logs
`/var/log/yum.log` -> yum logs
`/var/log/lastlog` -> last login logs
`/var/log/wtmp` -> login logs
`/var/log/btmp` -> failed login logs
`/var/log/utmp` -> current login logs
`/var/log/secure` -> authentication



