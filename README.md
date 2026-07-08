# Working with Git

This repository contains the development, testing, and implementation of critical UI components. Below is a detailed breakdown of the branching strategy, the interactive code review process, and key technical takeaways.

---

## Branching

I learnt about branching strategy to ensure that feature development never disrupted the stable production codebase.

* **`main` / `master`**: The stable production branch.
* **`feature-header` (Renamed locally to `header`)**: Created a header branch, pushed various commits to this branch added comments on this commits, fixed those comments where necessary and then created a PR, allowing me to confirm and merge to the main branch.
    * *Note:* This branch was originally created as `feature-header` on the remote server but was renamed to `footer` locally during development to streamline the workflow.

* **`feature-footer` (Renamed locally to `footer`)**: Dedicated branch for the footer component. 
    * *Note:* This branch was originally created as `feature-footer` on the remote server but was renamed to `footer` locally during development to streamline the workflow.

---

## Pull Request (PR) Lifecycle & Iterative Changes

c:\Users\Hezekiah Oluwasanmi\Pictures\Screenshots\Screenshot (1880).png
![Creating PR](<Screenshot (1881).png>)
![Adding comments to PR](<Screenshot (1882).png>)
![Changes and comments added to PR](<Screenshot (1883).png>)
![Before merge](<Screenshot (1884).png>)
*Above: Screenshots showcas the merged PR, feedback comments, and final integration into the main branch.*

---

## Most Frequently Used Git Commands and Key Learnings

These were the core commands used to manage the code, resolve branch naming mismatches, and maintain a clean history:

```bash
# 1. Inspect differences between local workspace and remote tracking branches
git diff HEAD..origin/header-footer -- README.md"(Specify the files i need to check here)"
git diff HEAD..origin/feature-footer -- README.md"(Specify the files i need to check here)"

# 2. Pull remote updates and smoothly slide them underneath local work
git pull origin feature-header --rebase
git pull origin feature-footer --rebase

# 3. View a compressed, clean history of incoming remote commits
git log HEAD..origin/feature-header --oneline
git log HEAD..origin/feature-footer --oneline

# 4. Safely inspect what a specific file looks like on the remote server
git show origin/feature-footer:README.md

# 5. Undo the effects of an existing commit while preserving history
git revert <commit-hash (which i will get using git reflog)>