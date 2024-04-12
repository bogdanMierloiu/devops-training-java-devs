`ln -s SOURCE TARGET` - create a symbolic link to a file or directory.
`ln SOURCE TARGET` - create a hard link to a file or directory.

`rm softlink` - remove a symbolic link.


- You can't create a hard link to a directory. It only applies to files.
- If an original file is deleted, the hard link still exists.
- A hard link remains intact when an original file is moved or renamed.
- A file exists until the last hard link is deleted.
- It is not possible to create a hard link between two file systems.
- The content change is reflected in all linked files.