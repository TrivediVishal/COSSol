#!/bin/bash

# Accept sales and cost from the user
read -p "Enter the sales amount: " sales
read -p "Enter the cost amount: " cost

# Calculate profit
profit=$((sales - cost))

# Calculate taxes (10% of profit)
taxes=$((profit * 10 / 100))

# Calculate net profit
net_profit=$((profit - taxes))

# Display the results
echo "Profit: $profit"
echo "Taxes (10% of profit): $taxes"
echo "Net Profit: $net_profit"

