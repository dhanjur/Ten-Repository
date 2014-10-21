<header><b>TEN SPECIFIC TAGS</b></header>
<table style="width:100%">
	<tr><td width='50%'>Modified </td><td width='50%'><input type="text" name="tenLearningObjectAnnotationsBean.modified" /></td></tr>
	<tr><td>Rights Holder </td><td><input type="text" name="tenLearningObjectAnnotationsBean.rightsHolder" /></td></tr>
	<tr><td>Tribe</td><td><input type="text" name="tenLearningObjectAnnotationsBean.tribe" /></td></tr>
	<tr><td>Category</td><td> <input type="text" name="tenLearningObjectAnnotationsBean.category" /></td></tr>
	<tr><td>Topic Theme </td><td><input type="text" name="tenLearningObjectAnnotationsBean.topicTheme" /></td></tr>
	<tr><td>Sub topic theme </td><td><input type="text" name="tenLearningObjectAnnotationsBean.subTopicTheme" /></td></tr>
	<tr><td>Rating </td>
		<td>
		<select name="tenLearningObjectAnnotationsBean.rating">
			<option value="1" <c:if test="${tenLearningObjectAnnotationsBean.rating == '1'}">selected</c:if>>Poor</option>
			<option value="2" <c:if test="${tenLearningObjectAnnotationsBean.rating == '2'}">selected</c:if>>Fair</option>
			<option value="3" <c:if test="${tenLearningObjectAnnotationsBean.rating == '3'}">selected</c:if>>Good</option>
			<option value="4" <c:if test="${tenLearningObjectAnnotationsBean.rating == '4'}">selected</c:if>>Excellent</option>
		</select>
		</td>
	</tr>
</table>
