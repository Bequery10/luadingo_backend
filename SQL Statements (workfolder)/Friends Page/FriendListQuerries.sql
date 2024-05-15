USE luolingo;

-- FINDING FRIEND REQUESTS YOU RECIEVED

SELECT * FROM friends_with
WHERE username2 = 'input_username' AND status = 'Pending';

-- FINDING FRIEND REQUESTS YOU SENT

SELECT * FROM friends_with
WHERE username1 = 'input_username' AND status = 'Pending';

-- CHECKING ACCEPTED FRIENDS

SELECT * FROM friends_with
WHERE (username1 = 'input_username' OR username2 = 'input_username') AND status ='Accepted';


