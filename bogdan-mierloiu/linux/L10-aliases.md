`alias lh='ls -alh'` - create an alias for `ls -alh` command. Now, when we type `lh` in the terminal, it will execute `ls -alh` command.
`source ./.bashrc` - to apply the changes from the `.bashrc` file, we need to source it. This will make the `lh` alias available in the terminal.

For all users ->  aliases must be defined in  /etc/profile.d.