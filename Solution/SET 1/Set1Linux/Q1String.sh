echo "Enter the first string:"
read str1
echo "Enter the string2"
read str2
if [ "${str1,,}" == "${str2,,}" ]
then
echo "The two strings match"
else
echo "The two strings do not match"
fi
