Ver. 3.0

- 30 rules in total
- 10 Furscal's, 20 another's
- Outputs each found token; tokens with multiple choices display
option found, including _Def tokens
- <ID> token now displays position number
- Added structure to Furscal:
    - Imports always at the top
    - Variables must be declared beforehand before being used   
        - This was achieved using 2 different production rules for both types of ID:
            - Left side IDs are considered declarations, and simply added to the ID list
            - Right side or alone IDs are considered already declared. This is checked, if false, an exception is thrown