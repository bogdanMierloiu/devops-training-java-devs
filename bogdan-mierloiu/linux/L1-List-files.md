# ls -> list items without arguments
## "Arguments are case-sensitive, like... everything in Linux :)"
ls -alSr
ls -l
ls -lh

- arguments:
  ls -l  -> list items with details
  ls -a  -> list all items including hidden ones with "dotfiles" (files starting with a dot)
  ls -n  -> list items with user and group identifiers instead of names
  ls -al -> list all items with details
  ls -Al -> all items except "." and ".." ( -A = almost all items)
  GID -> group identifier
  UID -> user identifier

- sorting
  By default, ls sorts items alphabetically. You can sort items by time of last modification using the -t argument.
  ls -t -> sort by time of last modification
  ls -lt -> sort by time of last modification with details

**atime** -> the last time when file was accessed
**mtime** -> the last modification time. By modification, we mean change in the file content.
**ctime** -> the last metadata modification time. We mean here - permissions change, location of the file, etc.

-ltc -> sort by time of last change with details
-ltu -> sort by time of last access with details

ls -ls -> sort by size, largest are going to be first
ls -lh -> sort by size, human-readable format (KB, MB, GB, etc.)
ls -l --si -> sort by size, human-readable format (KiB, MiB, GiB, etc.)
ls -lSh -> sort by size, human-readable format, largest are going to be first
ls --format=commas -> format, with commas  = ls -m
ls --format=long -> format, long = ls -l
ls -alR -> list all items with details, recursively


Conclusion:
Command to show a long-formatted list of the files in directory = ls -l
Argument for sort files = S
UID represents = user identifier
List the parent directory files = ls ..
Ordered list by time of the last modification of the content of the files = ls -ltu