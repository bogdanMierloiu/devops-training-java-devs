1. How to download `Oracle Virtual Box` on my laptop with VPN restrictions? 
2. Is the `CTRL+Z` command, a valid way to exit from `vim`?
  `CTRL+Z` -> does not exit Vim. It suspends Vim and returns you to the shell. This means Vim is running in the background.
  You can use the `fg` command to return to Vim.
  The correct way to exit from `vim` is to press: 
  `Esc` and then `:q!` to exit without saving,
  `Esc` and then `:wq` to save and exit,
  `Esc` and then `:w` to save,
  `Esc` and then `:q` to exit.