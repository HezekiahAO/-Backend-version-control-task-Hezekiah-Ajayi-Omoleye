# Working with Git

Welcome to my personal Git repo! This repository is dedicated to testing, practicing, and mastering version control workflow. The primary goal here is to demonstrate my hands-on knowledge of Git commands, branching strategies, and the collaborative workflows used by professional development teams.
This repository contains the development, testing, and implementation of critical UI components. Below is a detailed breakdown of the branching strategy, the interactive code review process, and key technical takeaways.

---

## Branching

I learnt about branching strategy to ensure that feature development never disrupted the stable production codebase.

* **`main` / `master`**: The stable production branch.
* **`feature-header` (Renamed locally to `header`)**: Created a header branch, pushed various commits to this branch added comments on this commits, fixed those comments where necessary and then created a PR, allowing me to confirm and merge to the main branch.
    * *Note:* This branch was originally created as `feature-header` on the remote server but was renamed to `footer` locally during development to streamline the workflow.

* **`feature-footer` (Renamed locally to `footer`)**: Dedicated branch for the footer component. 
    * *Note:* This branch was originally created as `feature-footer` on the remote server but was renamed to `footer` locally during development to streamline the workflow.

Here is a breakdown of the specific Git wizardry and collaborative workflows showcased in this repository:
### 1. Advanced Branching Strategies
*   **Feature Branching:** Creating isolated environments for features or fixes to keep the `main` branch stable.
*   **Branch Naming Conventions:** Utilizing clean naming patterns (e.g., `feature-header`, `bugfix/resolve-button-issue`, 'etc').

### 2. The Pull Request (PR) Lifecycle
*   **PR Creation:** Writing clear, descriptive PR titles and descriptions explaining *what* was changed and *why*.
*   **Collaborative Reviews:** Simulating the developer-to-reviewer pipeline, handling feedback, and making iterative pushes to an active PR.
*   **Conflict Resolution:** Facing and resolving merge conflicts locally before merging code into production.

### 3. "Commit Magic" & Repository Management
*   **Atomic Commits:** Writing clear, concise, and purposeful commit messages.
*   **Merging & Rebasing:** Understanding when to use standard merges (preserving history) versus rebasing/squashing (keeping a clean, linear history).
*   **Remote Synchronization:** Executing `git fetch`, `git pull`, `git push`, and managing upstream tracking.
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

1.  **Clone / Pull:** Ensure the local repository is perfectly synced with the remote `main`.
    ```bash
    git checkout main
    git pull origin main
    ```
2.  **Branch:** Create a dedicated branch for a specific test case.
    ```bash
    git checkout -b feature-header
    ```
3.  **Commit:** Make changes and commit them with semantic messages.
    ```bash
    git add .
    git commit -m "feat: demonstrate branch isolation and atomic commits"
    ```
4.  **Push:** Push the local branch to the remote GitHub repository.
    ```bash
    git push origin feature-header
    ```
5.  **PR & Merge:** Open a Pull Request on GitHub, review the diff, simulate a code review, and merge it cleanly into `main`.

## Tech Stack & Tools Used
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

>**Kindly Note to Reviewers / Hiring Managers:** 
> This repository is intentionally dynamic and filled with experimental branches, merge logs, and PR history. It stands as proof that I understand the vital workflow of Git that keeps engineering teams moving fast without breaking things.
# 5. Undo the effects of an existing commit while preserving history
git revert <commit-hash (which i will get using git reflog)>
