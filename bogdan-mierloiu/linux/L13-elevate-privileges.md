`su - newuser` - switch to newuser

`vim /etc/sudoers.` - edit sudoers file
`update-alternatives --config editor` - change default editor (use vim - option 3)
`visudo` - edit sudoers file
`newuser ALL=(ALL:ALL) ALL` - add newuser to sudoers file
`student2 ALL=(ALL:ALL) NOPASSWD:ALL` - add student2 to sudoers file without password
`:wq` - save and exit
`su - newuser` - switch to newuser
`sudo apt-get update` - test sudo permissions


## Finally, please note that using the `visudo` command is the recommended way to update sudoers content, since it protects against many failure modes.