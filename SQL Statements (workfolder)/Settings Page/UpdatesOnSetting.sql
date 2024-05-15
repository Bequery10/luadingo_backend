USE luodingo;


-- FOR USERNAME UPDATING


UPDATE useraccount
SET username = 'new_username'
WHERE username = 'current_username';


-- FOR PASSWORD UPDATING
-- ASK FOR USERNAME TOO!

UPDATE useraccount
SET password = 'new_password'
WHERE username = 'current_username';