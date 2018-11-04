#Importing Socket package
import socket

#User Input as URL
str=raw_input("Enter URL:")
type(str)

# To retrieve ip address from URL
add=socket.gethostbyname(str)
print('Hostname:'+str)
print('IP:'+add)

# User Input as IP Address
ip=raw_input("Enter IP :")
type(ip)

# To retrieve URL name by IP Address
ipadd=socket.gethostbyaddr(ip)
print('IP:'+ip)
print('Hostname:'+ipadd[0])
