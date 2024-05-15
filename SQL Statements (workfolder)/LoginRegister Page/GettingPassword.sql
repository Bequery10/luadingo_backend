USE luadingo;

-- FOR GETTING PASSWORD 
-- WILL RETURN NO PASSWORD IF ONE DOESNT EXIST BUT CHANGE IT IF YOU WANT :]


SELECT CASE
	WHEN EXISTS ( SELECT * FROM user WHERE username = 'username')
    THEN (SELECT password FROM user WHERE username = 'username')
    ELSE 'no password'
    END