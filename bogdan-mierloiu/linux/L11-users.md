`whoami` / `id` -> current user
`id username` -> user information
`passwd` -> change password

UID 0 -> root
UID 1-99 -> predefined accounts (like games, mail, etc.)
UID 100-999 -> system and administrative accounts
UID 1000+ -> user accounts

GID 0 -> root
GID 1-99 -> reserved for system and application use
GID 100 + -> for users

`/etc/passwd` -> user account information
`/etc/shadow` -> user password information
`/etc/group` -> group information
`/etc/gshadow` -> group password information

`/etc/passwd` -> `username:password:UID:GID:GECOS:directory:shell`
`/etc/shadow` -> `username:password:lastchanged:min:max:warn:inactive:expire:reserved`
`/etc/group` -> `groupname:password:GID:users`
`/etc/gshadow` -> `groupname:password:admin:members`

`cat /etc/shadow` -> show password information
`cat /etc/group` -> show group information
`cat /etc/gshadow` -> show group password information

`useradd` *** -> create a new user or update default new user information
`adduser` -> add a user or group to the system
`usermod` -> modify a user account


`-d` - create home directory in specified location, if we want to change
`-m` - create the home directory
`-p` - password
`-s` - provide shell
`-c` - comments, or description of the account

`useradd testuser -s /bin/bash -m` -> create a new user with a home directory and shell
`-aG` - add another secondary group
`userdel -rf testuser` -> delete a user and its home directory