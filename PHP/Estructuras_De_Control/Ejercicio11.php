<?php
$height = 1.8;
$year_of_birth = 2007;

if ($height > 1.7 && $year_of_birth >= 1985 && $year_of_birth <= 2005) {
    echo "You're fit for the police application";
}
elseif ($height < 1.7 && $year_of_birth >= 1985 && $year_of_birth <= 2005) {
    echo "You're not fit for the application because you're under 1,70 meters";
}
elseif ($year_of_birth < 1985 || $year_of_birth > 2005) {
    echo "You're not fit for the application because you're not in the age fit to apply";
}
else {
    echo "You're not fit for the application because you do not meet the requirements";
}
?>