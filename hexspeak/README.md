<h2>1271. Hexspeak</h2><h3>Easy</h3><hr><div><p>A decimal number can be converted to its&nbsp;<em>Hexspeak representation</em>&nbsp;by first converting it to an uppercase hexadecimal string, then replacing all occurrences of the digit <code>0</code> with the letter <code>O</code>, and the digit <code>1</code> with the letter <code>I</code>.&nbsp; Such a representation&nbsp;is <em>valid</em>&nbsp;if and only if it consists only of the letters in the set <code>{"A", "B", "C", "D", "E", "F", "I", "O"}</code>.</p>

<p>Given a string <code>num</code>&nbsp;representing a decimal integer <code>N</code>, return the Hexspeak representation of <code>N</code> if it is valid, otherwise return <code>"ERROR"</code>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> num = "257"
<strong>Output:</strong> "IOI"
<b>Explanation: </b> 257 is 101 in hexadecimal.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> num = "3"
<strong>Output:</strong> "ERROR"
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= N &lt;= 10^12</code></li>
	<li>There are no leading zeros in the given string.</li>
	<li>All answers must be in uppercase letters.</li>
</ul>
</div>