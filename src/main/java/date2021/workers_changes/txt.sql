SELECT
	two.id,
	two.order_no orderNo,
	two.hire_time hireTime,
	two.currentSecond,
	two.previousSecond,
	IF (two.previousSecond = 0, 0, two.currentSecond - two.previousSecond) intervalSecond
FROM
	(
		SELECT
			one.id,
			one.order_no,
			one.hire_time,
			time_to_sec(one.hire_time) currentSecond,
			@one.hireTime AS previousSecond,
			@one.hireTime := time_to_sec(one.hire_time)
		FROM
			b2c_order one,
			(SELECT @one.hireTime := 0) tmp
		ORDER BY
			one.hire_time
	) two
